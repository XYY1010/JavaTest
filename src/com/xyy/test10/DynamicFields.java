package com.xyy.test10;

import static com.xyy.tools.Print.*;

class DynamicFieldsException extends Exception {}

public class DynamicFields {
	
	private Object[][] fields;
	public DynamicFields(int initialSize) {
		fields = new Object[initialSize][2];
		for (int i = 0; i < initialSize; i++) {
			fields[i] = new Object[] { null, null };
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Object[] obj : fields) {
			result.append(obj[0]);
			result.append(": ");
			result.append(obj[1]);
			result.append("\n");
		}
		return result.toString();
	}
	
	private int hasField(String id) {
		for (int i = 0; i < fields.length; i++) {
			if (id.equals(fields[i][0])) {
				return i;
			}
		}
		return -1;
	}
	
	private int getFieldNumber(String id) throws NoSuchFieldException {
		int fieldNum = hasField(id);
		if (fieldNum == -1) {
			throw new NoSuchFieldException();
		}
		return fieldNum;
	}
	
	private int makeField(String id) {
		for (int i = 0; i < fields.length; i++) {
			if (fields[i][0] == null) {
				fields[i][0] = id;
				return i;
			}
		}
		Object[][] tmp = new Object[fields.length + 1][2];
		for (int i = 0; i < fields.length; i++) {
			tmp[i] = fields[i];
		}
		for (int i = fields.length; i < tmp.length; i++) {
			tmp[i] = new Object[] { null, null };
		}
		fields = tmp;
		return makeField(id);
	}
	
	public Object getField(String id) throws NoSuchFieldException {
		return fields[getFieldNumber(id)][1];
	}
	
	public Object SetField(String id, Object value) throws DynamicFieldsException {
		if (value == null) {
			DynamicFieldsException dfe = new DynamicFieldsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		int fieldNumber = hasField(id);
		if (fieldNumber == -1) {
			fieldNumber = makeField(id);
		}
		Object result = null;
		try {
			result = getField(id);
		} catch (NoSuchFieldException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		fields[fieldNumber][1] = value;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicFields df = new DynamicFields(3);
		print(df);
		try {
			df.SetField("d", "A value for d");
			df.SetField("number", 47);
			df.SetField("number2", 48);
			print(df);
			df.SetField("d", "A new value for d");
			df.SetField("number3", 11);
			print("df: " + df);
			print("df.getField(\"d\"): " + df.getField("d"));
			Object field = df.SetField("d", null);
		} catch (NoSuchFieldException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		} catch (DynamicFieldsException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

}
