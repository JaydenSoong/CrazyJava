package classes;


class PrintArray implements Command {
   public void process(int[] target) {
        for(int i : target) {
            System.out.println("迭代输出的数组元素是：" + i);
        }
    }
}
