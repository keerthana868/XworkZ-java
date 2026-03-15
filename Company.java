class Company {
    int id;
    String name;
    double revenue;
    int employees;
    String hq;
    double marketCap;
    String industry;
    int foundedYear;
    double stockPrice;
    int branches;
    String ceo;
    boolean isPublic;

    Company(int id) {
        this.id = id;
        System.out.println("Company Id: " + id);
    }

    Company(String name) {
        this.name = name;
        System.out.println("Comp: " + name);
    }

    Company(double revenue) {
        this.revenue = revenue;
        System.out.println("Rev: " + revenue);
    }

    Company(int employees, String hq) {
        this.employees = employees;
        this.hq = hq;
        System.out.println("Staff: " + employees);
        System.out.println("HQ: " + hq);
    }

    Company(double marketCap, String industry, int foundedYear) {
        this.marketCap = marketCap;
        this.industry = industry;
        this.foundedYear = foundedYear;
        System.out.println("Cap: " + marketCap);
        System.out.println("Sector: " + industry);
        System.out.println("Est: " + foundedYear);
    }

    Company(double stockPrice, int branches) {
        this.stockPrice = stockPrice;
        this.branches = branches;
        System.out.println("Stock: " + stockPrice);
        System.out.println("Units: " + branches);
    }

    Company(String ceo, boolean isPublic) {
        this.ceo = ceo;
        this.isPublic = isPublic;
        System.out.println("CEO: " + ceo);
        System.out.println("Public: " + isPublic);
    }
}