package homework.lesson2.task3;

public class Phone {
    public static void main(String[] args) {

        Phone phone = new Phone();

        System.out.println(phone.matches("+7(910)423-73-12"));
        System.out.println(phone.matches("7(910)423-73-12"));
        System.out.println(phone.matches("89215310934"));
        System.out.println(phone.matches("+5(911)310-12-74"));
        System.out.println(phone.matches("+7(9fg)125-42-99"));
        System.out.println(phone.matches("+7(122)2342343"));
        System.out.println();
        System.out.println(phone.cycles("+7(910)423-73-12"));
        System.out.println(phone.cycles("7(910)423-73-12"));
        System.out.println(phone.cycles("89215310934"));
        System.out.println(phone.cycles("+5(911)310-12-74"));
        System.out.println(phone.cycles("+7(9fg)125-42-99"));
        System.out.println(phone.cycles("+7(122)2342343"));

    }

    boolean matches(String phone){
        return phone.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }

    boolean cycles(String phone){

        if (phone == null || phone.length() != 16){
            return false;
        }
        if (!phone.startsWith("+7(")){
            return false;
        }
        if (phone.charAt(6) != ')'){
            return false;
        }
        if (phone.charAt(10) != '-'){
            return false;
        }
        if (phone.charAt(13) != '-'){
            return false;
        }

        int[] element = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};

        String namber = "0123456789";
        
        for (int index : element){
            String ind = String.valueOf(phone.charAt(index));
            if (!namber.contains(ind)) {
                return false;
            }
        }
        return true;
    }
}
