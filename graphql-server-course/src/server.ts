import { ApolloServer } from '@apollo/server';
import { startStandaloneServer } from '@apollo/server/standalone';

const server = new ApolloServer({
  typeDefs: `#graphql
    type Query {
      message: String
      hi: String
    }
  `,
  resolvers: {
    Query: {
      message: async () => {
        return 'Hello World!!';
      },
      hi: async () => {
        return 'Hi!';
      },
    },
  },
});

const { url } = await startStandaloneServer(server, {
  listen: {
    port: 4003,
  },
});

console.log(`🚀 Server read at: ${url}`);
