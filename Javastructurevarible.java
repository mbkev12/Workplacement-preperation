package inlinefunctions;

class StudentExample {
    private String Student_name;
    private int Student_fees;

    public StudentExample(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	// constructor
    public void Student(String Student_name, int Student_fees) {
        this.Student_name = Student_name;
        this.Student_fees = Student_fees;
    }

    // getter
    public String getStudentName() {
        return Student_name;
    }
    public int getStudentFees() {
        return Student_fees;
    }

    public static void main(String[] args){
    	StudentExample[] array = new StudentExample[2];  // new stands for create an array object
        array[0] = new StudentExample("Kevin", 1); // new stands for create an employee object
        array[1] = new StudentExample("Kevin", 2);
        for(int i=0; i< array.length;i++){
            System.out.println(array[i].getStudentName()+" "+ array[i].getStudentFees());
        }
    }
}