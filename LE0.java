/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class setget{
    private String name ;
    private int age ;
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName; 
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }
}

public class LE1
{
	public static void main(String[] args) {
	    
	    setget obj = new setget();
	    obj.setName("Shrinu");
	    obj.setAge(20);
	    System.out.println("Name = " + obj.getName());
	    System.out.println("Age = " + obj.getAge());
	}
}