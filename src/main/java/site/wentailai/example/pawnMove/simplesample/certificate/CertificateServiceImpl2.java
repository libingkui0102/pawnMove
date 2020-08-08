package site.wentailai.example.pawnMove.simplesample.certificate;

public class CertificateServiceImpl2 implements CertificateService{

    public void save(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxxx");
        c.setStatus("save");
    }
    public void submit(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxxx");
        if(c.getStatus().equals("save")) {
            c.setStatus("submit");
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
    public void hrPass(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxxx");
        if(c.getStatus().equals("submit")) {
            c.setStatus("hr_pass");
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
    public void leaderPass(Certificate c) {
        // 其他逻辑
        c.setOtherInfo("xxxx");
        c.setStatus(getStuats(c.getStatus(), "leader_pass"));
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

    private String getStuats(String status, String action) {
        if(status.equals("save") ) {
            if(action.equals("submit")) {
                return "submit";
            }
            else {
                throw new UnsupportedOperationException();
            }
        }
        if(status.equals("hr_pass")) {
            if(action.equals("leader_pass")) {
                return "leader_pass";
            }
            else {
                throw new UnsupportedOperationException();
            }
        }
        // 省略其他代码
        throw new UnsupportedOperationException();
    }
}
