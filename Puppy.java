

public class Puppy {


    int puppyAge;  ///狗年几
    String move;         //狗行为
    String number;               //狗号数
    private String dognumber;
    String name; ///   如果，这不声明变量，DOGMUNBER。就打不出
    String color;   ///  如果，这不声明变量，DOGMUNBER。就打不出
    //而且私有，还未搞明//狗号数的编码？？？？

    //注意私有是，后来补上去，因为，最后那句的变量。

    public Puppy(String name, String color) {
        // 这个构造器有2个参数：name color
        //感觉好怪，不返回空值（VOID）的String.类，只能创建一次，
        //但又可以并列创建，即   (String name,String color)

        //2次更改后，证明这里是最性运算的，

        System.out.println("小狗的名字是 1: " + name);
        System.out.println("小狗的颜色是 : " + color);
        // System.out.println("小狗的行为是 : " + move)   ;
        // System.out.println("小狗的号数是3 : " + number);

    }

    public void dogmove(String dog_run)
    //此处为String.返回VOID 可以多次创造，变是三次，
    //String(1值。) 。。。
    // public Void （2值过渡性，不能提取）(_徐非CLASS头有声明变量）
    // （String3值）
    //String(1值)=String(3值）
    //1和2值都有提取打印
    //
    {
        move = dog_run;
        // System.out.println("小狗的名字是 2: " + name);
        System.out.println("小狗的行为(move)(最早定义的) : " + move);
        System.out.println("小狗的行为dog_run1(最早定义的) : " + dog_run);

    }


    public void dognumber(String dog_num) {
        number = dog_num;
        //  System.out.println("小狗的名字是 3: " + name);
        System.out.println("小狗的号数是dogmumber : " + number);
        //System.out.println("小狗的颜色是 dogmunber: " + color);
        ///为什么不能打印，名和色尼，因为，都不是VOID空值。没返回，
        //而且后面未有值，徐非，有值，就可以打印
        //      2次更改后，在类头声明变量后，可作打印，默认为空f
        System.out.println("小狗的号数是 (dog_num): " + dog_num);

    }

    ///此处AGE 吾明搞到仲复杂。
    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        // System.out.println("小狗的名字是 4: " + name);
        System.out.println("小狗的年龄为 : " + puppyAge);
        return puppyAge;
        //以后，慢慢吞吞解罗。(好怪，发现此处变量赋值不变，可保存。)
    }


    public static void main(String[] args) {
        ///* 创建对象 */ 可以同创建多个对象，格式如数据插入。
        Puppy myPuppy = new Puppy("tommy", "blue");

        //  Puppy myPuppy1 =  new Puppy( "cow","red");
        ///创建的对象，有多少个，就显示多少次，只显示构建器
        ///里面的内容。

        myPuppy.dogmove("变量dog-run的赋值");
        myPuppy.dognumber("变量dog_num的赋值。");
        ///myPuppy的。变量空值（VOID）赋值。
        //myPuppy1.dogmove("变量dog-run1的赋值");
        //myPuppy1.dognumber("变量dog-run1的赋值");
        ///myPuppy1的。变量空值（VOID）赋值。
        //* 通过方法来设定age */
        myPuppy.setAge(2);
        /* 调用另一个方法获取age */
        myPuppy.getAge();
        /*你也可以像下面这样访问成员变量 */
        System.out.println("----------------------");
        System.out.println("小狗的名字是5: " + myPuppy.name);
        System.out.println("小狗的色 1: " + myPuppy.color);
        System.out.println("AGE变量值 : " + myPuppy.puppyAge);
        System.out.println("调number量出来 ： " + myPuppy.number);
        System.out.println("调move量出来 " + myPuppy.move);
        ///已经指定变是组了，还不空，要看看，什么回事了，
    }

}                    