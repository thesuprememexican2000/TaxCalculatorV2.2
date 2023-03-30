package com.example.ctc.BLL.Model;



public class TaxBracket {
    private float min;
    private float max;
    private float rate;

    public TaxBracket() {

    }

    public TaxBracket(float min, float max, float rate) {
        this.min = min;
        this.max = max;
        this.rate = rate;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
