package com.company;


import java.util.ArrayList;
import java.util.List;

public class Subset {

    public int[][] sample = new int[8][7];
    public List<int[]> data;
    int n = data.size();
    int h = (int) (.75*n);

    public Subset(ArrayList<int[]> data) {
        this.data = data;
        assert data.size() >= 8;
    }

    private void randomSampling() {
        for (int i = 0; i < 8; i++) {
            int randnum = (int) (Math.random()*n - 1);
            sample[i] = data.get(randnum);
        }

    }



}
