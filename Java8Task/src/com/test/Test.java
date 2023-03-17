package com.test;
import com.bean.*; 
import java.util.*;
import java.util.stream.*;


public class Test {
@SuppressWarnings({})
	public static void main(String[] args) {
		
	Address a1=new Address("sr nagar","hyd",500003);	
	Address a2=new Address("madhura nagar","raidurg",502001);	
	Address a3=new Address("kphb","rrdy",504002);	
	Address a4=new Address("kgt","hnk",506319);	
	Address a5=new Address("atk","hnk",506349);	
	Address a6=new Address("shiva nagar","wgl",506009);	
	Address a7=new Address("kgt","hnk",506319);	
	Address a8=new Address("wgl","wgl",506003);	
	Address a9=new Address("mlkpt","hyd",500032);	
	

	List<Section> s1=Arrays.asList( new Section("A"));
	List<Section> s2=Arrays.asList(new Section("B"));
	
	
	
	MobileNumber m1=new MobileNumber("000222", "654000");
	MobileNumber m2=new MobileNumber("555222", "333666");
	MobileNumber m3=new MobileNumber("000123", "000126");
	MobileNumber m4=new MobileNumber("333001", "111020");
	
	Student ss=new Student("mahesh",12,"male",2022,a1,m1, s1); 
	Student ss1=new Student("nikhil",13,"male",2023,a2,m2, s2); 
	Student ss2=new Student("hareesh",11,"male",2022,a3,m3,s1); 
	Student ss3=new Student("pavan",13,"male",2022,a4,m4, s2); 
	Student ss4=new Student("gopal",12,"male",2023,a5,m4, s2); 
	Student ss5=new Student("vijay",15,"male",2022,a6,m4, s2);  
	Student ss6=new Student("pavani",14,"female",2023,a7,m4, s1); 
	Student ss7=new Student("maheswari",13,"female",2022,a8,m4, s1); 
	Student ss8=new Student("vijayamma",12,"female",2023,a9,m4, s1); 
	
	
	List<Student>l=Arrays.asList(ss,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8);
	/*
	 * for(Student s:l) { System.out.println(s); }
	 */
	
	Map<String, Long>m=l.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
	System.out.println(m);
	
	System.out.println("===========================");
	
	System.out.println("students who joined in 2023 year :");
	l.stream().filter(s->s.getJoingyear()==2023).map(Student::getName).forEach(System.out::println);
	
	System.out.println("===========================");
	
	System.out.println("Total no. of students in each section :");
	Map<List<Section>, Long>msection=l.stream().collect(Collectors.groupingBy(Student::getSection,Collectors.counting()));
	System.out.println(msection);
	

	System.out.println("===========================");
	
	System.out.println("Students in ascending order :");
	Optional<String> s=l.stream().map(st->st.getName()).sorted().reduce((a,b )-> (a+", " + b).toUpperCase() );
	System.out.println(s);
	
    System.out.println("===========================");
	
	System.out.println("Students based on their ages :");
	Map<Object, Object>mm=l.stream().collect(Collectors.toMap(p->p.name, p->p.age));  
	System.out.println(mm);
	
    System.out.println("===========================");
	
	System.out.println("Students who are in A section :");
	List<Student> stud2 = l.stream().filter(st -> st.getSection().stream(). anyMatch(x -> Objects.equals(x.getSectionName(), "A")))
	                             .collect(Collectors.toList());                     
	
	Map<Object, Object>map=stud2.stream().collect(Collectors.toMap(p->p.name, p->p.mobileNumbers));  
	   for(Map.Entry<Object,Object>ma:map.entrySet()) {
	       System.out.println(ma.getKey()+" "+ma.getValue());
	       }
	 
     System.out.println("===========================");
	  	
	 System.out.println("Students list :");//converting List<Student> to List<String>
	 List<String>list=l.stream().map(Student::getName).collect(Collectors.toList());
	 System.out.println(list);
	 //List<Student> to String
	 String name = l.stream().map(Student::getName).collect(Collectors.joining(", ", "[", "]"));
     System.out.println(name);
	
	
	
	}

}
