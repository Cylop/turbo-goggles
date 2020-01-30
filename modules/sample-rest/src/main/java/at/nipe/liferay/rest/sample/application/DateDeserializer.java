package at.nipe.liferay.rest.sample.application;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class DateDeserializer extends StdDeserializer<LocalDateTime> {

	private static final long serialVersionUID = -8849109126951589395L;

	public DateDeserializer() {
		this(null);
	}

	protected DateDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public LocalDateTime deserialize(JsonParser parser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {

		String dateText = parser.getText();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime localDateTime = null;

		try {
			localDateTime = LocalDateTime.parse(dateText, formatter);
		} catch (Exception ex) {
			localDateTime = LocalDateTime.of(1971, 1, 1, 1, 1);
		}

		return localDateTime;
	}

}
