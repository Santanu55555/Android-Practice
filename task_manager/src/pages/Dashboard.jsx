import { Box } from "@chakra-ui/react";
import React from "react";
import { Navbar } from "../components/Navbar";
import { Sidebar } from "../components/Sidebar";

export const Dashboard = () => {
  return (
    <Box>
      <Sidebar  w="25%"h="100%" position="fixed"/>
      <Box w="75%">
        <Navbar/>
        <Box></Box>
      </Box>
    </Box>
  );
};
