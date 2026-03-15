class Google {
    String headQuarters; 
	String ceoName; 
	int employeeCount; 
	double stockPrice; 
	String browserName;
    int dataCenters; 
	boolean isAdSenseActive; 
	double revenueBillions; 
	String cloudPlatform; 
	int youtubeChannels;
    String pixelModel;
	boolean workspaceEnabled; 
	int androidVersions; 
	String aiModelName; 
	double gcpMarketShare;
    int yearlyPatents; 
	String doodleTopic; 
	boolean fiberOptics; 
	int officeLocations; 
	String domain;

    Google(String headQuarters, String ceoName, int employeeCount, double stockPrice, String browserName,int dataCenters, boolean isAdSenseActive, double revenueBillions, String cloudPlatform, int youtubeChannels,String pixelModel, boolean workspaceEnabled, int androidVersions, String aiModelName, double gcpMarketShare,int yearlyPatents, String doodleTopic, boolean fiberOptics, int officeLocations, String domain) {
        this.headQuarters = headQuarters; 
		this.ceoName = ceoName; 
		this.employeeCount = employeeCount;
        this.stockPrice = stockPrice; 
		this.browserName = browserName; 
		this.dataCenters = dataCenters;
        this.isAdSenseActive = isAdSenseActive; 
		this.revenueBillions = revenueBillions; 
		this.cloudPlatform = cloudPlatform;
        this.youtubeChannels = youtubeChannels; 
		this.pixelModel = pixelModel; 
		this.workspaceEnabled = workspaceEnabled;
        this.androidVersions = androidVersions; 
		this.aiModelName = aiModelName; 
		this.gcpMarketShare = gcpMarketShare;
        this.yearlyPatents = yearlyPatents; 
		this.doodleTopic = doodleTopic; 
		this.fiberOptics = fiberOptics;
        this.officeLocations = officeLocations; 
		this.domain = domain;
    }

    void display() {
        System.out.println("Headquarters: " + headQuarters);
        System.out.println("CEO: " + ceoName);
        System.out.println("Employees: " + employeeCount);
        System.out.println("Stock Price: " + stockPrice);
        System.out.println("Browser: " + browserName);
        System.out.println("Data Centers: " + dataCenters);
        System.out.println("AdSense Active: " + isAdSenseActive);
        System.out.println("Revenue (Billions): " + revenueBillions);
        System.out.println("Cloud Platform: " + cloudPlatform);
        System.out.println("YouTube Channels: " + youtubeChannels);
        System.out.println("Pixel Model: " + pixelModel);
        System.out.println("Workspace Enabled: " + workspaceEnabled);
        System.out.println("Android Versions: " + androidVersions);
        System.out.println("AI Model: " + aiModelName);
        System.out.println("GCP Market Share: " + gcpMarketShare);
        System.out.println("Yearly Patents: " + yearlyPatents);
        System.out.println("Doodle Topic: " + doodleTopic);
        System.out.println("Fiber Optics: " + fiberOptics);
        System.out.println("Office Locations: " + officeLocations);
        System.out.println("Domain: " + domain);
		System.out.println("--------------------------------");
    }
}