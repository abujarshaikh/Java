// interface in iheritance
interface IDemo {
    public void insert(int i);

    public int delete();

    public void display();
}

class Stack implements IDemo {
    int a[];
    int top;

    public Stack(int n) {
        a = new int[n];
        top = -1;
    }

    public void insert(int i) {
        if (top == a.length - 1) {
            System.out.println("Cannot Insert Elements as stack is full !!");
        } else {
            top = top + 1;
            a[top] = i;
        }
    }

    public int delete() {
        int temp;
        if (top == -1) {
            System.out.println("Cannot Delete Elements As Stack is Empty.");
            temp = -999;
        } else {
            temp = a[top];
            top--;
        }
        return temp;
    }

    public void display() {
        for (int i = 0; i < top; i++) {
            System.out.println(a[i]);
        }
    }
}

// class queue implements IDemo {
// int a[];
// int rear;

// public queue(int n) {
// a = new int[n];
// rear = -1;
// }

// public void insert(int i) {
// if (rear == a.length - 1) {
// System.out.println("Cannot Insert Elements Queue is full.");
// } else {
// rear = rear + 1;
// a[rear] = i;
// }
// }

// public int delete(int temp) {
// // int temp;
// if (rear == -1) {
// System.out.println("Cannot Delete Element as Queue is Empty.");
// } else {
// temp = a[0];
// for (int i = 0; i < (a.length - 1); i++) {
// a[i] = a[i + 1];
// rear--;
// }
// // return temp;
// }
// return temp;
// }

// public void display() {
// for (int i = 0; i <= rear; i++) {
// System.out.println(a[i]);
// }
// }

// }

class intefaceDemo {

    public static void main(String args[]) {
        System.out.println("Creating a Stack of Object of 5 elements.");
        Stack s = new Stack(5);
        System.out.println("Inserting 5 Elemets");
        s.insert(100);
        s.insert(200);
        s.insert(300);
        s.insert(400);
        s.insert(500);
        System.out.println("Displaying The elements of on the stack");
        s.display();
        System.out.println("The two Elemets Deleted From stack are: ");
        System.out.println(s.delete());
        System.out.println(s.delete());
        System.out.println("Displaying The elements of on the stack");
        s.display();
        System.out.println("Inserting two Elementson the stack");
        s.insert(1000);
        s.insert(1200);
        System.out.println("Displaying The elements of on the stack");
        s.display();
        System.out.println();
        // System.out.println("Creating a Queue of objects of 5 elements. ");
        // queue q = new queue(5);
        // System.out.println( "Inserting 5 Elements.");
        // q.insert(100);
        // q.insert(200);
        // q.insert(300);
        // q.insert(400);
        // q.insert(500);
        // System.out.println("Displaying The elements of on the queue");
        // q.display();
        // System.out.println("The two Elemets Deleted From queue are: ");
        // System.out.print(s.delete());
        // System.out.print(s.delete());
        // System.out.println("Displaying The elements of on the queue");
        // q.display();
        // System.out.println("Inserting two Elementson the queue");
        // q.insert(1000);
        // q.insert(1200);
        // System.out.println("Displaying The elements of on the queue");
        // q.display();
    }
}
