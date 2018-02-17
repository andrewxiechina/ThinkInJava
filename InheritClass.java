// Three ways to inherit: inherit, delegate, composite

class ControlPannel {
    void forward() {
        System.out.println("->>");
    }
}

class SpaceShipDelegate {
    private final ControlPannel controlPannel = new ControlPannel();

    void forward() {
        controlPannel.forward();
    }
}

class SpaceShipInherit extends ControlPannel {

}

class SpaceShipComposite {
    ControlPannel controlPannel = new ControlPannel();
}

public class InheritClass {
    public static void main(String[] args) {
        SpaceShipComposite s1 = new SpaceShipComposite();
        s1.controlPannel.forward();

        SpaceShipInherit s2 = new SpaceShipInherit();
        s2.forward();

        SpaceShipDelegate s3 = new SpaceShipDelegate();
        s3.forward();
    }
}