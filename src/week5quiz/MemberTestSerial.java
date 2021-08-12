package week5quiz;

import java.io.*;
import java.util.Base64;

public class MemberTestSerial {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Member member = new Member();
        member.setName("kim");
        member.setAge(20);

        //Serialize
        byte[] serializedMember;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {

                oos.writeObject(member);
                // serializedMember -> 직렬화된 member 객체
                System.out.println("호잇");
                System.out.println(baos.getClass().getName());
                serializedMember = baos.toByteArray();
                System.out.println(serializedMember.getClass().getName());
            }
        }
        //Base64 Encoding은 Binary Data를 Text로 변경하는 Encoding이다.
        // 바이트 배열로 생성된 직렬화 데이터를 base64로 변환 [인코딩]
        String base64Member = Base64.getEncoder().encodeToString(serializedMember);
        System.out.println(base64Member);

        //Deserialize
        //인코딩한 Text를 다시 binary data로 변경 [디코딩]
        byte[] deserializedMember = Base64.getDecoder().decode(base64Member);
        System.out.println(deserializedMember);

        try (ByteArrayInputStream bais = new ByteArrayInputStream(deserializedMember)){
            try (ObjectInputStream ois = new ObjectInputStream(bais)){

                Object objectMember = ois.readObject();
                System.out.println(objectMember);
            }
        }
    }
}
