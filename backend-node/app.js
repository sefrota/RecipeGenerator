const express = require('express');
const app = express();
const pantryRoutes = require('./router/pantryRoutes/routes');

app.get('/', (req, res) => res.send('Hello World!'));
app.use('/pantry', pantryRoutes)

app.listen(3000, () => console.log('Example app listening on port 3000'));