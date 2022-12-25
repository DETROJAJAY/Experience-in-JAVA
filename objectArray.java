public class objectArray {
    public static void main(String[] args)
    {
        student s[] = new student[9];
        s[0] = new student(1,2,'a','b','c');
        s[0].show();
        s[1] = new student(3,4,'g','h');
        s[1].show();
    }
}

class student
{
    int eno,mno;
    char name,email,address;

    student(int a, int b, char c, char d , char e)
    {
        eno = a;
        mno = b;
        name = c;
        email = d;
        address = e;
    }

    student(int a, int b, char c, char d)
    {
        eno = a;
        mno = b;
        name = c;
        email = d;
        address = 'j';
    }

    void show()
    {
        System.out.println(" " + eno + " " + mno + " " + name + " " + email + " " + address);
    }
}
