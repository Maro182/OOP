public class Company {
    private StringBuilder CompanyName;
    private Employee[] employees;
    private Product[] products;
    private int numOfEmployees;
    private int numOfProducts;

    public Company(StringBuilder companyName , int numOfEmployees, int numOfProducts) {
        this.CompanyName = companyName;
        this.employees = new Employee[numOfEmployees];
        this.products = new Product[numOfProducts];
        this.numOfEmployees = 0;
        this.numOfProducts = 0;
    }
    public String getCompanyName() {
        return CompanyName.toString();
    }
    public void addEmployee(Employee employee){
        if (numOfEmployees < employees.length){
            employees[numOfEmployees++] = employee;
        }else {
            System.out.println("Employee is already full");
        }
    }
    public void addProduct(Product product){
        if (numOfProducts < products.length){
            products[numOfProducts++] = product;
        }else {
            System.out.println("Product is already full");
        }
    }
    public void removeEmployee(Employee employee){
        for (int i = 0; i < numOfEmployees; i++){
            if (employees[i] == (employee)){
                employees[i] = employees[numOfEmployees-1];
                employees[numOfEmployees-1] = null;
                numOfEmployees--;
                break;
            }
        }
    }
    public void removeProduct(Product product){
        for (int i = 0; i < numOfProducts; i++){
            if (products[i].equals(product)){
                products[i] = products[numOfProducts-1];
                products[numOfProducts-1] = null;
                numOfProducts--;
                break;
            }
        }
    }
    public void CompanyInformation(){
        System.out.println("Company Information : ");
        System.out.println("Company Name : " + CompanyName);
        System.out.println("Number of Employees : " + numOfEmployees);
        System.out.println("Number of Products : " + numOfProducts);
        for (int i = 0; i < numOfEmployees; i++){
            System.out.println(employees[i].toString());
        }
        for (int i = 0; i < numOfProducts; i++){
            System.out.println(products[i].toString());
        }
    }
}
class Employee {
    private StringBuilder employeeName;
    private Integer employeeId;
    public Employee(StringBuilder employeeName , Integer employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }
    public StringBuilder getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(StringBuilder employeeName) {
        this.employeeName = employeeName;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName=" + employeeName +
                ", employeeId=" + employeeId +
                '}';
    }
}
class Product {
    private StringBuilder productName;
    private Double productPrice;
    public Product(StringBuilder productName , Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public StringBuilder getProductName() {
        return productName;
    }

    public void setProductName(StringBuilder productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName=" + productName +
                ", productPrice=" + productPrice +
                '}';
    }
}
