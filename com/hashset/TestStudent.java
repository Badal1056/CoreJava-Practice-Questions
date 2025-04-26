package com.hashset;

public class TestStudent {
		public static void main(String[] args) {

			Student s1=new Student("pavan",49);
			Student s2=new Student("nagesh",57);
			Student s3=new Student("pavan",49);
			Student s4=new Student("nayantara",53);
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s4.hashCode());
			System.out.println(s3.hashCode());
			HashSet s=new HashSet();
//			s.add(s1);
//			s.add(s2);
//			s.add(s3);
//			s.add(s4);
			System.out.println("Size: "+s.size());
			s.traverse();
		}
}