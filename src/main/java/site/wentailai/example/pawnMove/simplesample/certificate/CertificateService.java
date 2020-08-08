package site.wentailai.example.pawnMove.simplesample.certificate;

interface CertificateService {
    void save(Certificate c);
    void submit(Certificate c);
    void hrPass(Certificate c);
    void leaderPass(Certificate c);
    void hrReject(Certificate c);
    void leaderReject(Certificate c);
}
