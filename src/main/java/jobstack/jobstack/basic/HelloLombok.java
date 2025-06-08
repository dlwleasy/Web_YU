package jobstack.jobstack.basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    private String hello;
    private int lombok;
    //이 두가지 변수에대해서 값을 설정할 수 있게만들어주는 롬북
    public static void main(String[] args){
        HelloLombok helloLombok =new HelloLombok();

        //값 설정
        helloLombok.setHello("헬로");
        helloLombok.setLombok(5);
        //값 가져옴
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}

/*추가개념
public class HelloLombok {
    private final String hello;
    private final int lombok;
    public HelloLombok(String hello, int lombok) {
        this.hello = hello;
        this.lombok = lombok;
    }
    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬 로", 5);//
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
*/
