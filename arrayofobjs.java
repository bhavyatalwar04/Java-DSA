
class students {

    int roll;
    String name;

    students(int roll, String name) {
        this.name = name;
        this.roll = roll;

    }
}

class arrayofobjs {

    public static void main(String[] args) {

        students[] arr = new students[3];
        arr[0] = new students(1, "Bhavya");
        arr[1] = new students(2, "Aditya");
        arr[2] = new students(3, "Tarang");

        for (students s : arr) {
            System.out.println(s.roll + " " + s.name);
            // System.out.println(s.name);
        }

    }

}
