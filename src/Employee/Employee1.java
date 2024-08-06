package Employee;

public class Employee1 {

    // フィールド
    public String employeeName;     // 社員名
    public String divisionName;     // 部署名

    // 自己紹介メソッド
    public void introduce() {
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");

    }
}