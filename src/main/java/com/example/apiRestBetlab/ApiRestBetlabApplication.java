package com.example.apiRestBetlab;

import ch.qos.logback.classic.Logger;
import com.example.apiRestBetlab.model.CountryMaker;
import com.example.apiRestBetlab.model.MarketMaker;
import com.example.apiRestBetlab.services.MarketMakerService;
import com.example.apiRestBetlab.services.TextSafeService;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
@Log4j2
@SpringBootApplication
public class ApiRestBetlabApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestBetlabApplication.class, args);

/*		MarketMakerService service = new MarketMakerService();
		try {
		MarketMaker maker = service.pojoBuilder();

			maker.getSportsMaker()
					.forEach(sport-> sport.getCountrysMaker()
							.forEach(countryMaker -> countryMaker
									.getLeaguesMaker()
									.forEach(leagueMaker -> leagueMaker
											.getEventsMaker()
											.forEach(eventMaker -> System.out.println(
													eventMaker.getHomeTeam()
															+ " "
															+ "X"
															+ " "
															+ eventMaker.getVisitingTeam()
															+eventMaker.getDateOfEvent().toInstant())
											)
									)
							)


					);
		} catch (IOException e) {
			e.printStackTrace();
		}**/
	}

}
