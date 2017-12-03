const querystring = require('querystring');
const request = require('request');

const getIngredients = () => {
	return new Promise((fullfil, reject) => {
		request({
			uri: 'http://localhost:8080/pantry/getIngredients'
		}, (error, response, body) => {
			if(error){
				reject(error);
			}else{
				fullfil(response);
			}
		});
	});
}

const getIngredient = (id) => {
	return new Promise((fullfil, reject) => {
		request({
			uri: 'http://localhost:8080/pantry/getIngredient/'+id,
		}, (error, response, body) => {
			if(error){
				reject(error);
			}else{
				fullfil(response);
			}
		})
	})
}

module.exports = {
	getIngredients,
	getIngredient
}


