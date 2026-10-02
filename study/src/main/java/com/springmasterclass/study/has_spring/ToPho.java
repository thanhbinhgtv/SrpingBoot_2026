package com.springmasterclass.study.has_spring;
import org.springframework.stereotype.Component;

@Component
public class ToPho {
    private final BanhPho banhPho;
    private final Thit thit;
//    private final ThitBo thitBo;

    public ToPho(BanhPho banhPho, Thit thit) {
        this.banhPho = banhPho;
        this.thit = thit;
    }

//    public ToPho(BanhPho banhPho, ThitBo thitBo) {
//        this.banhPho = banhPho;
//        this.thitBo = thitBo;
//    }

    public void phucVu() {
        System.out.println("Phuc vu to pho gom " + banhPho.layBanhPho() + " va " + thitBo.layThitBo());
    }
}
