package java_mag.with_clojure_bin;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import beispiel_8.beispiel_8;

public class Beispiel_8 {

	public static void main(String[] args) throws Exception {

		beispiel_8 bsp8 = new beispiel_8("bar", 42);
		System.out.println(bsp8);

		JAXBContext context = JAXBContext.newInstance(beispiel_8.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(bsp8, System.out);

		Unmarshaller unmarshaller = context.createUnmarshaller();
		String foobar_4711 = "<beispiel8><foo>foobar</foo><bar>4711</bar></beispiel8>";
		System.out.println(unmarshaller.unmarshal(new StringReader(foobar_4711)));

	}

}