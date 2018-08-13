package _201808._08.MaximumDepthOfN_aryTree;

import java.util.List ;
import java.util.ArrayList ;
import java.util.Iterator ;
public class ListDemo{
	public static void main(String args[]){
		List<String> all=  new ArrayList<String>() ;	// 
		all.add("hello") ;
		all.add("_") ;
		all.add("world") ;
		Iterator<String> iter = all.iterator() ;	// 为Iterator接口实例化
		while(iter.hasNext()){	// 判断是否有内容
			String str = iter.next() ;
			if("_".equals(str)){
				all.remove(str) ;	// 删除元素		
			}else{
				System.out.println(str) ;	// 输出内容
			}
		}
		System.out.println("删除之后的集合：" + all) ;
	}
};

