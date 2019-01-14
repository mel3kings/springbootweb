package com.test.data;

@lombok.Data
public class Data {
    private String name;
    private String details;

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.details.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (null == other || !(other instanceof Data)) {
            return false;
        }
        Data otherData = (Data) other;
        if (null != otherData.getName() && null != otherData.getName() &&
                otherData.getName().equals(this.getName()) && otherData.getDetails().equals(this.getDetails())) {
            return true;
        } else {
            return false;
        }
    }
}
