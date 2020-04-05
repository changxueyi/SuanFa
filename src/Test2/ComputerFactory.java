package Test2;

/**
 * @ClassName ComputerFactory
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/2 20:12
 */
public class ComputerFactory {
    public static Computer createrComputer(String type) {
        Computer mComputer = null;
        switch (type){
            case "lenovo":
                mComputer=new LenovoComputer();
                break;
            case "hp":
                mComputer = new HPComputer();
                break;
            case "asus":
                mComputer = new AsusComputer();
                break;
        }
        return mComputer;
    }

}