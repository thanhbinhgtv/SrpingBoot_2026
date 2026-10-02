package com.springmasterclass.study.no_spring;

public class ToPho {
    private BanhPho banhPho;
    private ThitBo thitBo;

    public ToPho() {
        this.banhPho = new BanhPho();
        this.thitBo = new ThitBo();
    }

    public void phucVu() {
        System.out.println("Phuc vu to pho gom" + banhPho.layBanhPho() + " va " + thitBo.layThitBo());
    }
}
