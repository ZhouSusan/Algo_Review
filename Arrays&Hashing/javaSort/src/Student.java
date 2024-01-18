class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    /**
     * Method that compares and returns two students' gpa in ascending order.
     * @param student the object to be compared.
     * @return int - result integer from comparing two gpa
     */
    @Override
    public int compareTo(Student student) {
        String student1Gpa = Double.toString(this.getCgpa());
        String student2Gpa = Double.toString(student.getCgpa());

        int comp = student2Gpa.compareTo(student1Gpa);
        if (comp != 0) return comp;

        return this.getFname().compareTo(student.getFname());
    }
}