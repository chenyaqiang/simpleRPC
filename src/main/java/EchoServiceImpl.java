/**
 * @author: subiin
 * @date: 2018/1/21 下午11:05
 * @description:
 */
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String ping) {
        return ping != null ? ping + " ---> I am ok." : " I am ok.";
    }
}
