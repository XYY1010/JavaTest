package com.xyy.test8;

import static com.xyy.tools.Print.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Event> eventList = new ArrayList<Event> ();
	public void addEvent(Event c) { eventList.add(c); }
	public void run() {
		while (eventList.size() > 0) {
			// Make a copy so you're not modifying the list
			// while you're selecting the elements in it:
			for (Event e : new ArrayList<Event>(eventList)) {
				if (e.ready()) {
					print(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}

/** run()����ѭ������eventList��Ѱ�Ҿ����ģ�ready()����Ҫ���е�Event���󡣶��ҵ���ÿһ�������ģ�ready()��
 *  �¼���ʹ�ö����toString()��ӡ����Ϣ��������action()������Ȼ��Ӷ������Ƴ���Event
 */
