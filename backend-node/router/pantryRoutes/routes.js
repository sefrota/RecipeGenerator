const express = require('express');
const pantryController = require('../../controllers/pantryController');
const router = express.Router();


router.get('/getIngredients', (req, res) => {
	//call the backend to get the ingredients≤
	pantryController.getIngredients()
	.then((response) => {
		res.json(response);
	},(error) => {
		res.json(error);
	});
});

router.get('/getIngredient/:id', (req, res) => {
	//call the backend to get the ingredient by id
	if(req.params.id)
		pantryController.getIngredient(req.params.id)
		.then((response) =>{
			res.json(response);
		}, (error) =>{
			res.json(error);
		});
});

router.post('/addIngredient', (req, res) => {
	//call the backend to add the ingredient
});

router.put('/updateIngredient', (req, res) => {
	//call the backend to update the ingredient 
});
router.delete('/updateIngredient/:id', (req, res) => {
	//call the backend to delete the ingredient by id
});

router.get('/searchIngredient/:query', (req, res) => {
	//call the edamame api to get the ingredient information
	if(req.params.query)
		pantryController.searchIngredient(req.params.query)
		.then((response) =>{
			res.json(response);
		}, (error) =>{
			res.json(error);
		});
})

module.exports = router;