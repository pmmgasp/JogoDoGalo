const settings = require('./config.json');
const Pool = require('pg').Pool;

const pool = new Pool({
    user: settings.PostgreSQL.user || process.env.PGUSER,
    host: settings.PostgreSQL.host || process.env.PGHOST,
    database: settings.PostgreSQL.database || process.env.PGDATABASE,
    password: settings.PostgreSQL.password || process.env.PGPASSWORD,
    port: settings.PostgreSQL.port || process.env.PGPORT,
    ssl: { rejectUnauthorized: false },
})

module.exports = pool;

