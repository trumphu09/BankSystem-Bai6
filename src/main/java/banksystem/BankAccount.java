package banksystem;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }
    // CỐ TÌNH LỖI: Tên hàm viết hoa, biến viết hoa, thiếu khoảng trắng
    public void Rut_Tien(double SoTien){
        if(SoTien>0){
            this.balance-=SoTien;
        }
    }
}