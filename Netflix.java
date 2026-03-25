class Netflix{
	private String seriesNames[] = new String[19];
	int index;
	
	public boolean addSeriesName(String seriesName){
		boolean isSeriesAdded = false;
		if(seriesName != null && !seriesName.isEmpty()){
			seriesNames[index] = seriesName;
			index++;
			isSeriesAdded = true;
		}else{
			System.out.println(seriesName +"is invalid");
		}
		return isSeriesAdded;
	}
	public void getSeriesNames(){
		for(String seriesName:seriesNames){
			System.out.println(seriesName);
		}
	}
}
			