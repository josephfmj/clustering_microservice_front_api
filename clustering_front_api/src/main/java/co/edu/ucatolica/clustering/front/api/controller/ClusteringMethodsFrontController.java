package co.edu.ucatolica.clustering.front.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucatolica.clustering.front.api.model.ApiClusteringMethodResponse;


@RestController("/methods")
public class ClusteringMethodsFrontController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public ResponseEntity<ApiClusteringMethodResponse> getClusteringMethods() {

		return null;

	}

}
