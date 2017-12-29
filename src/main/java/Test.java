
import org.jscience.physics.amount.Amount;
import org.jscience.physics.model.RelativisticModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.measure.quantity.Mass;
import java.util.Map;

import static javax.measure.unit.SI.KILOGRAM;


/**
 * 最简单的控制类
 *
 * @author Lidy
 */
@RestController
public class Test {

    /**
     * Spring Boto默认使用的的json解析框架是jackson
     * 自动将对象解析成json数据
     *
     * @return
     */
    // @RequestMapping("/getDemo")
    // public Demo getDemo(){
    // 	Demo demo = new Demo();
    // 	demo.setId(1);
    // 	demo.setName("道哥");
    // 	return demo;
    // }


    // And add a hello method so that it reads like this:
    @RequestMapping("/hello")
    String hello(Map<String, Object> model) {
        RelativisticModel.select();
        Amount<Mass> m = Amount.valueOf("12 GeV").to(KILOGRAM);
        model.put("science", "E=mc^2: 12 GeV = " + m.toString());
        return "hello";
    }
}







