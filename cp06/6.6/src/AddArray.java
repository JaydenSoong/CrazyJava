package classes;


class AddArray implements Command {
   public void process(int[] target) {
        int sum = 0;
        for (int i : target) {
            sum += i;
        }
        System.out.println("数组元素的和是：" + sum);
    }
}
