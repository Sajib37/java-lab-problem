import java.util.*;

class rational {
    int num, denum;

    rational() {
    }
    
    // Set the numerator and denometor using constractor
    rational(int x,int y)
    {
        num = x;
        denum = y;
    }

    //adding two rational number
    rational add(rational ob)
    {
        rational temp = new rational();
        temp.num = (num * ob.denum) + (denum * ob.num);
        temp.denum = denum * ob.denum;
        return temp;
    }

    // substructing two rational number
    rational sub(rational ob)
    {
        rational temp = new rational();
        temp.num = (num * ob.denum) - (denum * ob.num);
        temp.denum = denum * ob.denum;
        return temp;
    }

    // multiplicatingf two rational number
    rational mul(rational ob)
    {
        rational temp = new rational();
        temp.num = num * ob.num;
        temp.denum = denum * ob.denum;
        return temp;
    }
    
    // Division of two rational number
    rational div(rational ob)
    {
        rational temp = new rational();
        temp.num = num*ob.denum;
        temp.denum = denum * ob.num;
        return temp;
    }

    void show()
    {
        System.out.println(num +"/" + denum);
    }
}


public class rationalNumber {

   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int p, q, r, s;
        System.out.println("Enter first rational number: ");
        p=sc.nextInt();
        q=sc.nextInt();
        System.out.println("Enter Second rational number: ");
        r=sc.nextInt();
        s=sc.nextInt();

        rational r1 = new rational(p, q);
        rational r2 = new rational(r, s);

        rational r3 = r1.add(r2);
        System.out.println("Added rational number is: ");
        r3.show();

        rational r4 = r1.sub(r2);
        System.out.println("After substructing rational number is: ");
        r4.show();

        rational r5 = r1.mul(r2);
        System.out.println("AFter multiplicatingf rational number is: ");
        r5.show();


        rational r6 = r1.div(r2);
        System.out.println(" After divided rational number is: ");
        r6.show();
    }
}
