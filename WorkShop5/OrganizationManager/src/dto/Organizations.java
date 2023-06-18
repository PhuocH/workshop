package dto;

public abstract class Organizations {
    /*Class trừu tượng Organizations chỉ chứa mỗi thông tin 
    về size và các tính trừu tượng khác trong class (CommunicateByTool, output)
    */
    protected int size;

    public Organizations() {
    }

    public Organizations(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public abstract void communicateByTool();
    public abstract void output();
    @Override
    public String toString() {
        return "The organization's size: " + size;
    }
    
    
}
