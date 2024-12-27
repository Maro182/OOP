public class TestCompany {
    public static void main(String[] args) {
        System.out.println("Company 1 : ");

        Company company1 = new Company(new StringBuilder("Mercedes") , 0  , 0);
        company1.addEmployee(new Employee(new StringBuilder("omar") , 20202));
        company1.addProduct(new Product(new StringBuilder("GClass") , 100000.0));
        System.out.println();
        company1.CompanyInformation();
        System.out.println();

        System.out.println("Company 2 : ");
        Company company2 = new Company(new StringBuilder("Apple") , 50 , 30);

        System.out.println("after adding 2 employees & 2 Products : ");

        company2.addEmployee(new Employee(new StringBuilder("Ahmed") , 2222));
        company2.addProduct(new Product(new StringBuilder("MacBook") , 120000.0));
        company2.addEmployee(new Employee(new StringBuilder("Mohamed") , 3333));
        company2.addProduct(new Product(new StringBuilder("IPhone 16") , 45000.0));
        company2.CompanyInformation();
        System.out.println();

        System.out.println("after removing Employee(mohamed) , product(IPhone 16)");
        company2.removeEmployee(new Employee(new StringBuilder("Mohamed") , 3333));
        company2.removeProduct(new Product(new StringBuilder("IPhone 16") , 45000.0));
        company2.CompanyInformation();
    }
}
