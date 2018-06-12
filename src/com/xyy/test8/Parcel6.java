package com.xyy.test8;

import static com.xyy.tools.Print.*;

// ���������������Ƕ��һ���ڲ���

public class Parcel6 {

	private void internalTracking(boolean b) {
		if (b) {
			/* TrackingSlip�౻Ƕ����if�����������ڣ��Ⲣ����˵����Ĵ������������ģ�����ʵ������һ�������ˡ�
			 * Ȼ�����ڶ���TrackingSlip��������֮�⣬���ǲ����õģ�����֮�⣬������ͨ��һ��
			 * */
			class TrackingSlip {
				private String id;
				TrackingSlip(String s) {
					id = s;
				}
				String getSlip() { return id; }
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			print(s);
		}
		// Can't use it here! Out of scope:
		//! TrackingSlip ts = new TrackingSlip("x");
	}
	
	public void track() { 
		internalTracking(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel6 p = new Parcel6();
		p.track();
	}

}
