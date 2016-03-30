/**
 *
 */
package com.ithaha.floorview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Long
 * @Date: 2016/3/30 15:39
 * 对评论的再次封装，每一个评论都对应一个SubComments对象，它里面封装个这个评论的所有楼层内容
 */
public class SubComments {

	private List<? extends Commentable> list;

	public SubComments(List<? extends Commentable> cmts) {
		if (cmts != null) {
			list = new ArrayList<>(cmts);
		} else {
			list = null;
		}
	}

	public int size() {
		return list == null ? 0 : list.size();
	}

	public int getFloorNum() {
		return list.get(list.size() - 1).getCommentFloorNum();
	}

	public Commentable get(int index) {
		return list.get(index);
	}

	public Iterator<? extends Commentable> iterator() {
		return list == null ? null : list.iterator();
	}
}
