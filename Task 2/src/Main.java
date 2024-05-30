public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        int id = 0;
        boolean flag = true;
        while (flag){
            id = id + 2;
            System.out.println("Уволен айтишник с id " + id);
            if(id == 100) {
                flag = false;
            }
        }
    }
}
