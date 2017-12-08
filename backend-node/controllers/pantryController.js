const querystring = require('querystring');
const request = require('request');
const appConfig = require('../config');

const getIngredients = () => {
	return new Promise((fulfil, reject) => {
		request({
			uri: 'http://localhost:8080/pantry/getIngredients'
		}, (error, response, body) => {
			if(error){
				reject(error);
			}else{
				fulfil(response);
			}
		});
	});
}

const getIngredient = (id) => {
	return new Promise((fulfil, reject) => {
		request({
			uri: 'http://localhost:8080/pantry/getIngredient/'+id,
		}, (error, response, body) => {
			if(error){
				reject(error);
			}else{
				fulfil(response);
			}
		})
	})
}

const searchIngredient = (query,barcode) => {
	console.log(appConfig);
	const uriRequest;
	if(!barcode){
		const encodedUrlString = encodeURIComponent(query);
		uriRequest = 'https://api.edamam.com/api/food-database/parser?ingr='+encodedUrlString+'&app_id='+appConfig.appId+'&app_key='+appConfig.appKey+'&page=0';
	}
	else{
		uriRequest = 'https://api.edamam.com/api/food-database/parser?UPC='+barcode+'&app_id='+appConfig.appId+'&app_key='+appConfig.appKey+'&page=0';
	}

	return new Promise((fulfil, reject) => {
		request({
			uri: uriRequest
		}, (error, response, body) => {
			if(error){
				reject(error);
			}else{
				//send back the 
				fulfil(response);
			}
		})
	})
}

const getNutritionalInfo = (yield, ingredients) => {

	return new Promise((fulfil, reject) => {
		request({
			uri: uriRequest,
			method: 'POST',
			body:ingredients
		}, (error, response, body) => {
			if(error){
				reject(error);
			}else{
				//send back the 
				fulfil(response);
			}
		})
	})
}

module.exports = {
	getIngredients,
	getIngredient,
	searchIngredient,
	getNutritionalInfo
}


