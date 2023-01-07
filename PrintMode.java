public abstract class PrintMode {

    protected int numPages;
    protected int pageSize;
    protected String orientation;
    protected int colorIntensity;
    protected double costPerPage;

    
    public int getNumPages() {
        return numPages;
    }


    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }


    public int getPageSize() {
        return pageSize;
    }


    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public String getOrientation() {
        return orientation;
    }


    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }


    public int getColorIntensity() {
        return colorIntensity;
    }


    public void setColorIntensity(int colorIntensity) {
        this.colorIntensity = colorIntensity;
    }


    public double getCostPerPage() {
        return costPerPage;
    }


    public void setCostPerPage(double costPerPage) {
        this.costPerPage = costPerPage;
    }


    //Refused Bequest
    public abstract void makeConfiguration();
}
