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

/** run()方法循环遍历eventList，寻找就绪的（ready()）、要运行的Event对象。对找到的每一个就绪的（ready()）
 *  事件，使用对象的toString()打印其信息，调用其action()方法，然后从队列中移除此Event
 */
