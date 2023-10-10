public class Runner {
    public static void main(String[] args) {

        Lens lens1 = new Lens(10, 23);
        Lens lens2 = new Lens(20, 30);



        Camera camera1 = new Camera("Sony", 50, 3, false, lens2);
        Camera camera2 = new Camera("Nixon", 80, 5, true, lens1);

        System.out.println(camera1);
        System.out.println(camera2);

        System.out.println("Amount of lenses " + Lens.getLensCounter());
        System.out.println("Amount of cameras " + Camera.getCamCounter());

        Lens lens3 = new Lens(32, 66);
        System.out.println("Amount of lenses " + Lens.getLensCounter());


        camera1.setLens(lens1);
        camera2.setLens(lens3);
        System.out.println(camera1);
        System.out.println(camera2);

        Lens lens4 = new Lens(340,40);


    }
}
