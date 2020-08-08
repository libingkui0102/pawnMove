package site.wentailai.example.pawnMove.simplesample.certificate;

public class CertificateServiceImpl1 implements CertificateService{

    public void save(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxxx");
        c.setStatus("save");
    }
    public void submit(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxxx");
        c.setStatus("submit");
    }
    public void hrPass(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxxx");
        c.setStatus("hr_pass");
    }
    public void leaderPass(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxxx");
        c.setStatus("leader_pass");
    }
    public void hrReject(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxxx");
        c.setStatus("save");
    }
    public void leaderReject(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxxx");
        c.setStatus("save");
    }
}
